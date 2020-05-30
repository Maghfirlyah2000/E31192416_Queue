/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192416_queue;

/**
 *
 * @author maghfirlyah
 */
public class E31192416_Queue {

	int queue[] = new int[5]; //variable array dengan nama queue bertipe integer memiliki  nilai 5
	int size; //menghasilkan jumlah elemen pada queue
	int front, rear; //variable front, dan rear dengan tipe data integer

	//untuk menambahkan elemen ke dalam queue.
	public void enQueue(int data) {
		//perulangan untuk queue apabila sudah penuh
		if (!isFull()) {
			queue[rear] = data; //data diisikan
			rear = (rear + 1) % 5;
			size = size + 1; //naikkan nilai size
		} else {
			//program akan menampilkan data berikut apabila sudah penuh
			System.out.println("Queue penuh");
		}
	}

	//untuk mengambil elemen dari queue
	public int deQueue() {
		int data = queue[front];
		//perulangan untuk mengeluarkan data terakhir
		if (!isEmpty()) {
			front = (front + 1) % 5;
			size = size - 1; //turunkan nilai size
		} else {
			//program akan menampilkan data berikut apabila kosong
			System.out.println("Queue kosong");
		}

		return data;
	}

	public void show() {
		//program akan menampilkan kalimat "Deret Data : "
		System.out.print("Deret Data : ");
		for (int i = 0; i < size; i++) {
			System.out.print(queue[(front + i) % 5] + " ");
		}
		System.out.println();
		//program akan menampilkan kalimat "Deret Keluar : "
		System.out.print("Deret Keluar : ");

		for (int n : queue) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	// jumlah item (data) dalam queue
	public int getSize() {
		return size;
	}

	//method untuk mengecek apakah queue masih kosong dengan tipe data boolean
	public boolean isEmpty() {
		return getSize() == 0;
	}

	//method untuk mengecek apakah queue sudah penuh atau tidak
	public boolean isFull() {
		return getSize() == 5;
	}
}

