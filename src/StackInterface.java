public interface StackInterface <Type> {
    public void push (Type item);

    public Type pop ();

    public Type peek ();

    public boolean empty();

    public int search (Type item);

}
