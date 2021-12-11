/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AAddAdditionSubition extends PAdditionSubition
{
    private PAdditionSubition _additionSubition_;
    private TPlus _plus_;
    private PMultiplication _multiplication_;

    public AAddAdditionSubition()
    {
    }

    public AAddAdditionSubition(
        PAdditionSubition _additionSubition_,
        TPlus _plus_,
        PMultiplication _multiplication_)
    {
        setAdditionSubition(_additionSubition_);

        setPlus(_plus_);

        setMultiplication(_multiplication_);

    }
    public Object clone()
    {
        return new AAddAdditionSubition(
            (PAdditionSubition) cloneNode(_additionSubition_),
            (TPlus) cloneNode(_plus_),
            (PMultiplication) cloneNode(_multiplication_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAddAdditionSubition(this);
    }

    public PAdditionSubition getAdditionSubition()
    {
        return _additionSubition_;
    }

    public void setAdditionSubition(PAdditionSubition node)
    {
        if(_additionSubition_ != null)
        {
            _additionSubition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _additionSubition_ = node;
    }

    public TPlus getPlus()
    {
        return _plus_;
    }

    public void setPlus(TPlus node)
    {
        if(_plus_ != null)
        {
            _plus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _plus_ = node;
    }

    public PMultiplication getMultiplication()
    {
        return _multiplication_;
    }

    public void setMultiplication(PMultiplication node)
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
            + toString(_additionSubition_)
            + toString(_plus_)
            + toString(_multiplication_);
    }

    void removeChild(Node child)
    {
        if(_additionSubition_ == child)
        {
            _additionSubition_ = null;
            return;
        }

        if(_plus_ == child)
        {
            _plus_ = null;
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
        if(_additionSubition_ == oldChild)
        {
            setAdditionSubition((PAdditionSubition) newChild);
            return;
        }

        if(_plus_ == oldChild)
        {
            setPlus((TPlus) newChild);
            return;
        }

        if(_multiplication_ == oldChild)
        {
            setMultiplication((PMultiplication) newChild);
            return;
        }

    }
}