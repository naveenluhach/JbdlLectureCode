//SQL queries storage

// sql1
// sql2
// sql3


class Storage{
    synchronized void displaySQLQueries(){
        for(int i=1; i<=5;i++){
            System.out.println(i);
        }
    }
}

class ClientLeader extends Thread{
    Storage storage;

    ClientLeader(Storage storage){
        this.storage = storage;
    }

    @Override
    public void run() {
      storage.displaySQLQueries();
    }
}

class ClientFollower extends Thread{
    Storage storage;

    ClientFollower(Storage storage){
        this.storage = storage;
    }

    @Override
    public void run() {
        storage.displaySQLQueries();
    }
}

public class SyncExample {
    public static void main(String[] args){
        Storage storage = new Storage();
        ClientLeader clientLeader = new ClientLeader(storage);
        ClientFollower clientFollower = new ClientFollower(storage);
        clientFollower.start();
        clientLeader.start();
    }
}
