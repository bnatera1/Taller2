package com.example.android.tallerclase;

/**
 * Created by android on 03/10/2017.
 */

public class Metodos {

    public static double breiner(int sexo, int tZapato,int marca, int cant) {
        double total = 0;
        int pre =0;
        cant = 1;



        if ((sexo == 0) && (tZapato == 0) && (marca == 0)) {
            pre = 120000;
        } else {
            if (((sexo == 0) && (tZapato == 0) && (marca == 1))) {
                pre = 140000;
            } else {
                if (((sexo == 0) && (tZapato == 0) && (marca == 2))) {
                    pre = 130000;
                }
            }

        }

        if (((sexo == 0) && (tZapato == 1) && (marca == 0))) {
            pre = 50000;
        } else {
            if (((sexo == 0) && (tZapato == 1) && (marca == 1))) {
                pre = 80000;
            } else {
                if (((sexo == 0) && (tZapato == 1) && (marca == 2))) {
                    pre = 100000;
                }
            }

        }
        if (((sexo == 1) && (tZapato) == 0) && (marca == 0)) {
            pre = 100000;
        } else {
            if (((sexo == 1) && (tZapato == 0) && (marca == 1))) {
                pre = 130000;
            } else {
                if (((sexo == 1) && (tZapato == 0) && (marca == 2))) {
                    pre = 110000;
                }
            }

        }
        if (((sexo == 1) && (tZapato == 1) && (marca == 0))) {
            pre = 60000;
        } else {
            if ((sexo == 1) && (tZapato == 1) && (marca == 1)) {
                pre = 70000;
            } else {
                if (((sexo == 1) && (tZapato == 1) && (marca == 2))) {
                    pre = 120000;
                }
            }

        }

        total = pre * cant;
        return total;
    }
}




