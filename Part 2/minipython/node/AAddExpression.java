/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AAddExpression extends PExpression
{
    private PExpression _addition_;
    private PExpression _multiplication_;

    public AAddExpression()
    {
    }

    public AAddExpression(
        PExpression _addition_,
        PExpression _multiplication_)
    {
        setAddition(_addition_);

        setMultiplication(_multiplication_);

    }
    public Object clone()
    {
        return new AAddExpression(
            (PExpression) cloneNode(_addition_),
            (PExpression) cloneNode(_multiplication_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAddExpression(this);
    }

    public PExpression getAddition()
    {
        return _addition_;
    }

    public void setAddition(PExpression node)
    {
        if(_addition_ != null)
        {
            _addition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _addition_ = node;
    }

    public PExpression getMultiplication()
    {
        return _multiplication_;
    }

    public void setMultiplication(PExpression node)
    {
        if(_multiplication_ != null)
        {
            _multiplication_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _multiplication_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_addition_)
            + toString(_multiplication_);
    }

    void removeChild(Node child)
    {
        if(_addition_ == child)
        {
            _addition_ = null;
            return;
        }

        if(_multiplication_ == child)
        {
            _multiplication_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_addition_ == oldChild)
        {
            setAddition((PExpression) newChild);
            return;
        }

        if(_multiplication_ == oldChild)
        {
            setMultiplication((PExpression) newChild);
            return;
        }

    }
}