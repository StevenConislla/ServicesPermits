package com.plug.mod3class6;

import android.app.Service;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by OSKAR on 11/08/2017.
 * Oskar Steven Conislla Contreras
 * oskarconislla20@gmail.com
 * 947446763
 */

public class InternetService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //el onStartCommand se ejecuta cuando se inicializa el servicio
        //Necesitamos los permisos de internet
        //Conecatamos al serivicio que deseamos testear
        ConnectivityManager connectivityManager=
                (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        //networkinfo me dice si esta activo o no el internet
        NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
        //isAvaiable->Disponbilidad para ser usado, es un metodo de networkinfo
        //Preguntamos si esta conectado y si esta disponible para ser usado

        if(networkInfo!=null){
            if (networkInfo.isConnected()&&
                    networkInfo.isAvailable()){
                Toast.makeText(this, "Hay internet", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "No hay internet", Toast.LENGTH_SHORT).show();
            }}
            else{
                Toast.makeText(this, "No hay internet", Toast.LENGTH_SHORT).show();
            }



        //START_STICKY retorna 1, es una variable definida de los servicces
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Se cerro el servicio", Toast.LENGTH_SHORT).show();
    }
}
