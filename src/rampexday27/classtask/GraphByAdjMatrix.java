package rampexday27.classtask;

 class GraphbyAdjMatrix {


    public static void main(String[] args) {

        GraphDs g1 = new GraphDs(4);


        g1.display();


    }




}



class GraphDs{


    // number of vertices;
    // the adjacency matrix;




    int vertices;


    int [][] adj ;

    // parameterized constructor
    GraphDs(int vertices ){
        this. vertices = vertices;

        adj = new int[vertices][vertices];

    }

    //no -arg constructor

    GraphDs(){}


    void display(){

        for(int i =0; i<adj.length;i++){ // outer



            for(int j =0;j<adj[i].length;j++){ //inner

                System.out.print(adj [i][j] + " ");


            }
            System.out.println();
        }



    }


}