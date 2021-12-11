/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class ADivEqualCompEqs extends PCompEqs
{
    private TDivEq _divEq_;

    public ADivEqualCompEqs()
    {
    }

    public ADivEqualCompEqs(
        TDivEq _divEq_)
    {
        setDivEq(_divEq_);

    }
    public Object clone()
    {
        return new ADivEqualCompEqs(
            (TDivEq) cloneNode(_divEq_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADivEqualCompEqs(this);
    }

    public TDivEq getDivEq()
    {
        return _divEq_;
    }

    public void setDivEq(TDivEq node)
    {
        if(_divEq_ != null)
        {
            _divEq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _divEq_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_divEq_);
    }

    void removeChild(Node child)
    {
        if(_divEq_ == child)
        {
            _divEq_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_divEq_ == oldChild)
        {
            setDivEq((TDivEq) newChild);
            return;
        }

    }
}