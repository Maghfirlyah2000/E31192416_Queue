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
public class Runner {

	public static void main(String[] args) {
		E31192416_Queue q = new E31192416_Queue();
		q.deQueue();

		q.enQueue(5); //menambahkan elemen 5 ke dalam queue q
		q.enQueue(1); //menambahkan elemen 1 ke dalam queue q
		q.enQueue(0); //menambahkan elemen 0 ke dalam queue q
		q.enQueue(2); //menambahkan elemen 2 ke dalam queue q

		q.deQueue();

		q.enQueue(4); //menambahkan elemen 4 ke dalam queue q
		q.enQueue(2); //menambahkan elemen 2 ke dalam queue q

		q.enQueue(6); //menambahkan elemen 6 ke dalam queue q

		System.out.println(q.isFull());

		System.out.println("Size " + q.getSize());
		q.show();
	}
}

