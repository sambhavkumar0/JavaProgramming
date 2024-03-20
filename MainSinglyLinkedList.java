class Main {
  public static void main(String[] args) {
    SinglyLinkedList sLL = new SinglyLinkedList();
    sLL.createSinglyLinkedList(5);
    // System.out.println(sLL.head.value);
    sLL.insertInLinkedList(6, 1);
    sLL.insertInLinkedList(7, 1);
    sLL.insertInLinkedList(8, 1);
    sLL.insertInLinkedList(9, 0);
    sLL.traverseSinglyLinkedList();
    sLL.deleteSLL();
    sLL.traverseSinglyLinkedList();

  }
}
