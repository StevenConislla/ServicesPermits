package com.plug.mod3class6;

import android.app.Application;
import android.content.IntentFilter;

/**
 * Created by OSKAR on 11/08/2017.
 * Oskar Steven Conislla Contreras
 * oskarconislla20@gmail.com
 * 947446763
 */

public class Configuracion extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        //Al momento que registras un receiver, se queda ejecutando hasta que diga que ya no lo necesito, osea que lo quite el registro
        IntentFilter intentFilter=new IntentFilter(CONNECTIVITY_SERVICE);
        registerReceiver(new InternetReceiver(),intentFilter);

    }
}
