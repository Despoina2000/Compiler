/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AGreatCompTypes extends PCompTypes
{
    private TGreat _great_;

    public AGreatCompTypes()
    {
    }

    public AGreatCompTypes(
        TGreat _great_)
    {
        setGreat(_great_);

    }
    public Object clone()
    {
        return new AGreatCompTypes(
            (TGreat) cloneNode(_great_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGreatCompTypes(this);
    }

    public TGreat getGreat()
    {
        return _great_;
    }

    public void setGreat(TGreat node)
    {
        if(_great_ != null)
        {
            _great_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _great_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_great_);
    }

    void removeChild(Node child)
    {
        if(_great_ == child)
        {
            _great_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_great_ == oldChild)
        {
            setGreat((TGreat) newChild);
            return;
        }

    }
}