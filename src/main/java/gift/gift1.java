package gift;

/*import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class gift1 {

    public static BufferedReader f = null;
    public static PrintWriter out = null;
    public static StringTokenizer st = null;

    public static int NP;
    public static int[] moneyValues;
    public static String[] names;


    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        f = new BufferedReader(new FileReader("src/main/gift1.in"));
        out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
        st = new StringTokenizer(f.readLine());

        initializeVariables();

        for(int i = 0; i< NP; i++){
            out.println(names[i] + " " + moneyValues[i]);
        }
        out.close();


    }

    public static void initializeVariables() throws IOException {
        NP = Integer.parseInt(st.nextToken());
        moneyValues = new int[NP];
        names = new String[NP];
        initializeNames();

        for(int i = 0; i < NP; i++){
            st = new StringTokenizer(f.readLine());
            int indexOfName = find(st.nextToken());
            //System.out.println(indexOfName);
            st = new StringTokenizer(f.readLine());
            int moneyLost = Integer.parseInt(st.nextToken());
            moneyValues[indexOfName] -= moneyLost;
            int numOfPeople = Integer.parseInt(st.nextToken());

            if(numOfPeople != 0){
                //System.out.println(numOfPeople);
                int moneyDivided = moneyLost / numOfPeople;
                moneyValues[indexOfName] += moneyLost%numOfPeople;


                for(int j = 0; j < numOfPeople; j++){
                    st = new StringTokenizer(f.readLine());
                    String name = st.nextToken();
                    int indexOfReciever = find(name);
                    moneyValues[indexOfReciever] += moneyDivided;
                }

            }



        }



    }

    private static void initializeNames() throws IOException {
        for(int i = 0; i < NP; i++){
            st = new StringTokenizer(f.readLine());
            names[i] = st.nextToken();
            //System.out.println(names[i]);
            moneyValues[i] = 0;
        }
    }

    public static int find(String name){
        //System.out.println(name);
        for(int i = 0; i < NP; i++){
            if(names[i].equals(name)) return i;
        }
        //System.out.println(name);
        return -1;

    }

}*/






/*
ID: kaustub11
LANG: JAVA
TASK: gift1
*/

import java.io.*;
import java.util.StringTokenizer;

class gift1 {

    public static BufferedReader f = null;
    public static PrintWriter out = null;
    public static StringTokenizer st = null;

    public static int NP;
    public static int[] moneyValues;
    public static String[] names;


    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        f = new BufferedReader(new FileReader("/Users/kkhulbe/Desktop/USACO_Projects/src/main/java/gift/gift1.in"));
        out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
        st = new StringTokenizer(f.readLine());

        initializeVariables();

        for(int i = 0; i< NP; i++){
            out.println(names[i] + " " + moneyValues[i]);
        }
        out.close();


    }

    public static void initializeVariables() throws IOException {
        NP = Integer.parseInt(st.nextToken());
        moneyValues = new int[NP];
        names = new String[NP];
        initializeNames();

        for(int i = 0; i < NP; i++){
            st = new StringTokenizer(f.readLine());
            int indexOfName = find(st.nextToken());
            //System.out.println(indexOfName);
            st = new StringTokenizer(f.readLine());
            int moneyLost = Integer.parseInt(st.nextToken());
            moneyValues[indexOfName] -= moneyLost;
            int numOfPeople = Integer.parseInt(st.nextToken());

            if(numOfPeople != 0){
                //System.out.println(numOfPeople);
                int moneyDivided = moneyLost / numOfPeople;
                moneyValues[indexOfName] += moneyLost%numOfPeople;


                for(int j = 0; j < numOfPeople; j++){
                    st = new StringTokenizer(f.readLine());
                    String name = st.nextToken();
                    int indexOfReciever = find(name);
                    moneyValues[indexOfReciever] += moneyDivided;
                }

            }



        }



    }

    private static void initializeNames() throws IOException {
        for(int i = 0; i < NP; i++){
            st = new StringTokenizer(f.readLine());
            names[i] = st.nextToken();
            //System.out.println(names[i]);
            moneyValues[i] = 0;
        }
    }

    public static int find(String name){
        //System.out.println(name);
        for(int i = 0; i < NP; i++){
            if(names[i].equals(name)) return i;
        }
        //System.out.println(name);
        return -1;

    }

}

