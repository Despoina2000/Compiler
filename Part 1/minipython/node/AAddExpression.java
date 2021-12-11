/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AAddExpression extends PExpression
{
    private PAdditionSubition _additionSubition_;

    public AAddExpression()
    {
    }

    public AAddExpression(
        PAdditionSubition _additionSubition_)
    {
        setAdditionSubition(_additionSubition_);

    }
    public Object clone()
    {
        return new AAddExpression(
            (PAdditionSubition) cloneNode(_additionSubition_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAddExpression(this);
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

    public String toString()
    {
        return ""
            + toString(_additionSubition_);
    }

    void removeChild(Node child)
    {
        if(_additionSubition_ == child)
        {
            _additionSubition_ = null;
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

    }
}