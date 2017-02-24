class PriorityQueueApp {

    public static void main(String[] args){

        PriorityQueue nPQ = new PriorityQueue();
        nPQ.insert(15);
        nPQ.insert(20);
        nPQ.insert(50);
        long temp = nPQ.peekMin();
        System.out.println("Minimalnoe"+ temp);

        nPQ.remove();
        nPQ.remove();
        nPQ.display();

        nPQ.insert(1);
        nPQ.insert(40);
        nPQ.insert(1000);
        nPQ.display();

        Link priorvivod = nPQ.remove();
        System.out.println(priorvivod.dData);

        priorvivod = nPQ.remove();
        System.out.println(priorvivod.dData);


    }
}
