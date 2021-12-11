/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AMinusMathTypes extends PMathTypes
{
    private TMinus _minus_;

    public AMinusMathTypes()
    {
    }

    public AMinusMathTypes(
        TMinus _minus_)
    {
        setMinus(_minus_);

    }
    public Object clone()
    {
        return new AMinusMathTypes(
            (TMinus) cloneNode(_minus_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMinusMathTypes(this);
    }

    public TMinus getMinus()
    {
        return _minus_;
    }

    public void setMinus(TMinus node)
    {
        if(_minus_ != null)
        {
            _minus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _minus_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_minus_);
    }

    void removeChild(Node child)
    {
        if(_minus_ == child)
        {
            _minus_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_minus_ == oldChild)
        {
            setMinus((TMinus) newChild);
            return;
        }

    }
}