package com.reverse;
interface Bus
{
    void move();
}
class ElectricBus implements Bus
{
    public void move()
    {
        System.out.println("Implemented  move() method.");
    }
}

