package Fattoriale;

class Fattoriale {
    static int fatt(int x) {
        int i;
        int f=1;

        for(i=1; i<=x; i=i+1) {
            f=f*i;
        }

        return f;
    }

    public static void main(String[] args) {
        int a;
        int d;

        a=5;
        d=fatt(a);
        System.out.println("fattoriale di "+a+" = "+fatt(a));

        a=4;
        System.out.println("fattoriale di "+a+" = "+fatt(a));

        a=2;
        System.out.println("fattoriale di "+a+" = "+fatt(a));
    }
}