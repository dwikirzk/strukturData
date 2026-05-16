public class queue {
  static int size = 4;
  static int[] que = new int[size];
  static int rear = -1;

  public static void main(String[] args) {
    peek();
    enqueue(4);
    enqueue(5);
    enqueue(7);
    enqueue(6);
    enqueue(8);
    dequeue();
    dequeue();
    dequeue();
    dequeue();
    dequeue();
  }

  public static void peek() {
    if (isEmpty())
      System.out.println("Antrian kosong");
    else
      System.out.println("Antrian paling depan adalah " + que[0]);
  }

  public static boolean isEmpty() {
    if (rear == -1)
      return true;
    else
      return false;
  }

  public static boolean isFull() {
    if (rear == size - 1)
      return true;
    else
      return false;
  }

  public static void enqueue(int x) {
    if (isFull())
      System.out.println("Antrian penuh");
    else {
      System.out.println(x + " Masuk ke antrian");
      rear = rear + 1;
      que[rear] = x;
    }
    viewQue();
  }

  public static void dequeue() {
    if (isEmpty())
      System.out.println("Antrian kosong");
    else {
      System.out.println(que[0] + " Keluar dari antrian");
      for (int i = 0; i < rear; i++) {
        que[i] = que[i + 1];
      }
      rear = rear - 1;
    }
    viewQue();
  }

  public static void viewQue() {
    System.out.println("Antrian saat ini : ");
    for (int i = 0; i <= rear; i++) {
      System.out.print(que[i] + " ");
    }
    System.out.println();
  }
}
