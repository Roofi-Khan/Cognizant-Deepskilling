package Week1.AlgorithmsDataStructures.Exercise5_TaskManagement;

public class TaskLinkedList {

    private Task head;

    public void addTask(Task task) {

        if(head == null) {

            head = task;
            return;
        }

        Task temp = head;

        while(temp.next != null)
            temp = temp.next;

        temp.next = task;
    }

    public void traverse() {

        Task temp = head;

        while(temp != null) {

            System.out.println(
                    temp.taskName);

            temp = temp.next;
        }
    }

    public void deleteTask(int id) {

        if(head == null)
            return;

        if(head.taskId == id) {

            head = head.next;
            return;
        }

        Task temp = head;

        while(temp.next != null &&
                temp.next.taskId != id) {

            temp = temp.next;
        }

        if(temp.next != null)
            temp.next = temp.next.next;
    }
}
