/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator_rmi;
import java.rmi.*;

/**
 *
 * @author 0cil650
 */
public interface Fungsi extends Remote {
   
    public int tambah(int a, int b) throws RemoteException;
    public int kurang(int a, int b) throws RemoteException;
    public int kali(int a, int b) throws RemoteException;
    public int bagi(int a, int b) throws RemoteException;
}
