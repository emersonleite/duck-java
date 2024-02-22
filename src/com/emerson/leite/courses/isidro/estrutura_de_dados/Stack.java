package com.emerson.leite.courses.isidro.estrutura_de_dados;

public class Stack {
  private int elements[];
  private int capacity;
  private int topIndex;

  public Stack(int capacity) {
    this.capacity = capacity;
    elements = new int[capacity];
    topIndex = -1;
  }

  public void push(int element) {
    topIndex += 1;
    elements[topIndex] = element;
  }

  public boolean isEmpty() {
    return topIndex == -1;
  }

  public boolean isFull() {
    return topIndex == capacity - 1;
  }

  public int pop() {
    int element = elements[topIndex];
    topIndex -= 1;
    return element;
  }

}
