package com.jda.DesignPattern;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
}
