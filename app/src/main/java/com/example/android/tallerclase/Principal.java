package com.example.android.tallerclase;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Principal extends AppCompatActivity {


    private TextView valor;
    private EditText cantidad;
    private Spinner sexo;
    private Spinner tZapato;
    private Spinner marca;
    private Resources resources;
    private String op[];
    private String op2[];
    private String op3[];
    private ArrayAdapter<String> adapter1, adapter2, adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        valor = (TextView)findViewById(R.id.lblValor);
        cantidad = (EditText)findViewById(R.id.lblCantidad);
        sexo = (Spinner)findViewById(R.id.cmbSexo);
        tZapato = (Spinner)findViewById(R.id.cmbTzapato);
        marca = (Spinner)findViewById(R.id.cmbMarca);
        resources = this.getResources();
        op = resources.getStringArray(R.array.sexo);
        op2 = resources.getStringArray(R.array.Tzapato);
        op3 = resources.getStringArray(R.array.marca);
        adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,op);
        adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,op2);
        adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,op3);

        sexo.setAdapter(adapter1);
        tZapato.setAdapter(adapter2);
        marca.setAdapter(adapter3);


    }

    public boolean Validar() {
        if (cantidad.getText().toString().isEmpty()) {
            cantidad.setError(resources.getString(R.string.error1));
            return false;
        }
        return true;
    }

    public void  Calcular(View v) {
        int pre=0, posicion, cant, total;
        posicion = sexo.getSelectedItemPosition();
        cant = Integer.parseInt(cantidad.getText().toString());


        if ((sexo.getSelectedItemPosition()==0)&&(tZapato.getSelectedItemPosition()==0)&&(marca.getSelectedItemPosition()==0)){
            pre = 120000;
        }else {
            if (((sexo.getSelectedItemPosition()==0)&&(tZapato.getSelectedItemPosition()==0)&&(marca.getSelectedItemPosition()==1))){
                pre = 140000;
            }else {
                if (((sexo.getSelectedItemPosition()==0)&&(tZapato.getSelectedItemPosition()==0)&&(marca.getSelectedItemPosition()==2))){
                    pre = 130000;
                }
            }

        }

        if (((sexo.getSelectedItemPosition()==0)&&(tZapato.getSelectedItemPosition()==1)&&(marca.getSelectedItemPosition()==0))){
            pre = 50000;
        }else {
            if (((sexo.getSelectedItemPosition()==0)&&(tZapato.getSelectedItemPosition()==1)&&(marca.getSelectedItemPosition()==1))){
                pre = 80000;
            }else {
                if (((sexo.getSelectedItemPosition()==0)&&(tZapato.getSelectedItemPosition()==1)&&(marca.getSelectedItemPosition()==2))){
                    pre = 100000;
                }
            }

        }
        if (((sexo.getSelectedItemPosition()==1)&&(tZapato.getSelectedItemPosition()==0)&&(marca.getSelectedItemPosition()==0))){
            pre = 100000;
        }else {
            if (((sexo.getSelectedItemPosition()==1)&&(tZapato.getSelectedItemPosition()==0)&&(marca.getSelectedItemPosition()==1))){
                pre = 130000;
            }else {
                if (((sexo.getSelectedItemPosition()==1)&&(tZapato.getSelectedItemPosition()==0)&&(marca.getSelectedItemPosition()==2))){
                    pre = 110000;
                }
            }

        }
        if (((sexo.getSelectedItemPosition()==1)&&(tZapato.getSelectedItemPosition()==1)&&(marca.getSelectedItemPosition()==0))){
            pre = 60000;
        }else {
            if (((sexo.getSelectedItemPosition())==1)&&(tZapato.getSelectedItemPosition()==1)&&(marca.getSelectedItemPosition()==1)){
                pre = 70000;
            }else {
                if (((sexo.getSelectedItemPosition()==1)&&(tZapato.getSelectedItemPosition()==1)&&(marca.getSelectedItemPosition()==2))){
                    pre = 120000;
                }
            }

        }

        total = pre*cant;
        valor.setText("" + ( total));
    }


    public void Borrar(View v){
        valor.setText("");
        cantidad.setText("");
        cantidad.requestFocus();
        sexo.setSelection(0);
        tZapato.setSelection(0);
        marca.setSelection(0);


    }





}
