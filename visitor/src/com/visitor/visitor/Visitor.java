package com.visitor.visitor;

import com.visitor.shapes.Circle;
import com.visitor.shapes.CompoundShape;
import com.visitor.shapes.Dot;
import com.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}