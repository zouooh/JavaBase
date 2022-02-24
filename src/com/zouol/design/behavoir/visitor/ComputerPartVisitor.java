package com.zouol.design.behavoir.visitor;

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Monitor monitor);
}
