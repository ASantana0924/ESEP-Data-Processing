public class InMemoryDB implements InMemoryDB {

  private HashMap<String, Integer> dataStore; // Main data store
  private HashMap<String, Integer> transactionStore; // Temporary data store for transactions
  private boolean inTransaction; // Flag to indicate ongoing transaction

  public InMemoryDB() {
    dataStore = new HashMap<>();
    transactionStore = new HashMap<>();
    inTransaction = false;
  }

  @Override
  public int get(String key) {
    // Get value from transaction store if in transaction, otherwise use main store
    return inTransaction ? transactionStore.get(key) : dataStore.get(key);
  }

  @Override
  public void put(String key, int val) {
    if (!inTransaction) {
      throw new IllegalStateException("Transaction required for put operation");
    }
    transactionStore.put(key, val);
  }

  @Override
  public void begin_transaction() {
    if (inTransaction) {
      throw new IllegalStateException("Only one transaction can be active at a time");
    }
    transactionStore = new HashMap<>(); // Create a new temporary store for the transaction
    inTransaction = true;
  }

  @Override
  public void commit() {
    if (!inTransaction) {
      throw new IllegalStateException("No transaction to commit");
    }
    // Merge transaction data into main store and clear temporary store
    dataStore.putAll(transactionStore);
    transactionStore.clear();
    inTransaction = false;
  }

  @Override
  public void rollback() {
    if (!inTransaction) {
      throw new IllegalStateException("No transaction to rollback");
    }
    // Discard changes in temporary store and reset transaction flag
    transactionStore.clear();
    inTransaction = false;
  }
}
