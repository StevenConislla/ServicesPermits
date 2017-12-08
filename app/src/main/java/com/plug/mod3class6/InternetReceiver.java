package com.plug.mod3class6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * Created by OSKAR on 11/08/2017.
 * Oskar Steven Conislla Contreras
 * oskarconislla20@gmail.com
 * 947446763
 */

public class InternetReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        ConnectivityManager connectivityManager=
                (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
        if (networkInfo!=null){
            if (networkInfo.isAvailable()&& networkInfo.isConnected()){
                Toast.makeText(context, "Hay internet - Receiver", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(context, "No hay internet - Receiver", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(context, "No hay internet - Receiver", Toast.LENGTH_SHORT).show();
        }

    }
}
