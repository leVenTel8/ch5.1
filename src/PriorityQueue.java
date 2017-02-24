class PriorityQueue {

    SortedList queueList;

    public PriorityQueue(){

        queueList = new SortedList();

    }

    public void insert(long dd){

        queueList.insert(dd);

    }

    public Link remove(){

        if(queueList.isEmpty()){

            System.out.println("Ochered pysta.");
            return null;

        }
        else
            return queueList.remove();

    }

    public long peekMin(){
        return queueList.getFirst();
    }
    public boolean isEmpty()
    {
        return queueList.isEmpty();
    }
    public void display()
    {
        queueList.displayList();
    }

}
