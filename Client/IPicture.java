

import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IPicture extends Remote {
    // Khai báo phương thức tính bình phương
    public String drawPic(String data) throws RemoteException;
}