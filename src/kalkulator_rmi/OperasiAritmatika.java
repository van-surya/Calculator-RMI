/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author 0cil650 
 */
public class OperasiAritmatika extends UnicastRemoteObject implements Fungsi {
    int hasil;
    
    public OperasiAritmatika() throws RemoteException{
    }

    @Override
    public int tambah(int a, int b) throws RemoteException {
        hasil=a+b;
        return hasil;
    }

    @Override
    public int kurang(int a, int b) throws RemoteException {
        hasil=a-b;
        return hasil;
    }

    @Override
    public int kali(int a, int b) throws RemoteException {
         hasil=a*b;
        return hasil;
    }

    @Override
    public int bagi(int a, int b) throws RemoteException {
         hasil=a/b;
        return hasil;
    }
    
}
