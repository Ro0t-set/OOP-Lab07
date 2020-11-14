package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {

	private List<T> list;

	public OneListAcceptable(List<T> list) {
		super();
		this.list = list;
	}

	@Override
	public Acceptor<T> acceptor() {
		Iterator<T> iterator = list.iterator();
		return new Acceptor<T>() {


			public void accept(T newElement) throws ElementNotAcceptedException {
				if(!iterator.hasNext() || !iterator.next().equals(newElement) ) {
					throw  new ElementNotAcceptedException(newElement);
				}
			}


			public void end() throws EndNotAcceptedException {
				if(iterator.hasNext()) {
					throw new EndNotAcceptedException();
				}

			}

		};
	}

}
