package org.example;

public class Example3 {
  public static void main(String[] args) {
    Dog[] kennel = new Dog[3];
    kennel[0] = new Dog("Lassie");
    kennel[1] = new Dog("Bethoveen");
    kennel[2] = new Dog("Bullseye");

    for (Dog puppy : kennel) {
      System.out.println(puppy);
    }
  }
}
