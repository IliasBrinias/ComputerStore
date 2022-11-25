package com.unipi.msc.interfaces;

import com.unipi.msc.factory.Computer;

public interface ComputerListener {
    void onComputerReceived(Computer c);
    void outOfStock();
    String getChoice();
}
