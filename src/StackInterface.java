public interface StackInterface <Type> {
    public Type push (Type item);

    public Type pop (Type item);

    public Type peek (Type item);

    public boolean empty();

    public int search (Type item);

}
