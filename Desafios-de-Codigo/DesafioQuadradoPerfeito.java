package javabasico.victor.setimasemana.desafiodecodigo;

import java.util.*;

public class DesafioQuadradoPerfeito {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int[] d = new int[n + 1];
        int qp = 0;
        for(int i = 1; i<d.length-1; i++) {
            if(i * i <= n)
                d[i-1] = i * i;
            else
                i=d.length-1;
        }
//
//        for (int da: d)
//            System.out.println(da);

        int total = 1000, aux = 0, count;

        for (int i = d.length-1; i != 0 && i<=n; i--){
            if(d[i] != 0){
                aux = n;
                count = 0;

                for(int y = i; y > 0; y--){
                    while(aux > 0){
                        if(aux >= d[y]){
                            aux = aux - d[y];
                            count++;
                        }else y--;
                    }
                    if(total>count) total = count;
                }
            }
        }

        System.out.println(total);
    }
}
