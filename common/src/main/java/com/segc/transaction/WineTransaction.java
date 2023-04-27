package com.segc.transaction;

/**
 * @author fc54685 Francisco Correia
 * @author fc55955 Alexandre Fonseca
 * @author fc56272 Filipe Egipto
 */
public class WineTransaction implements Transaction {
    private static final long serialVersionUID = -6711990500501916335L;
    private final String wineName;
    private final String authorId;
    private final long quantity;
    private final double costPerUnit;
    private final Type type;

    public WineTransaction(String wineName, String authorId, int quantity, double costPerUnit, Type type) {
        this.wineName = wineName;
        this.authorId = authorId;
        this.quantity = quantity;
        this.costPerUnit = costPerUnit;
        this.type = type;
    }

    @Override
    public String getItemId() {
        return wineName;
    }

    @Override
    public long getUnitCount() {
        return quantity;
    }

    @Override
    public double getUnitPrice() {
        return costPerUnit;
    }

    @Override
    public String getAuthorId() {
        return authorId;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("Transaction:%n" +
                "  Wine: %s%n" +
                "  Author: %s%n" +
                "  Quantity: %d%n" +
                "  Cost per unit: %f%n" +
                "  Type: %s%n", getItemId(), getAuthorId(), getUnitCount(), getUnitPrice(), getType());
    }
}