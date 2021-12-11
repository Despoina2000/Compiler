/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AArgument extends PArgument
{
    private TId _id_;
    private final LinkedList _groupEqVal_ = new TypedLinkedList(new GroupEqVal_Cast());
    private final LinkedList _groupCommaIdEqVal_ = new TypedLinkedList(new GroupCommaIdEqVal_Cast());

    public AArgument()
    {
    }

    public AArgument(
        TId _id_,
        List _groupEqVal_,
        List _groupCommaIdEqVal_)
    {
        setId(_id_);

        {
            this._groupEqVal_.clear();
            this._groupEqVal_.addAll(_groupEqVal_);
        }

        {
            this._groupCommaIdEqVal_.clear();
            this._groupCommaIdEqVal_.addAll(_groupCommaIdEqVal_);
        }

    }
    public Object clone()
    {
        return new AArgument(
            (TId) cloneNode(_id_),
            cloneList(_groupEqVal_),
            cloneList(_groupCommaIdEqVal_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArgument(this);
    }

    public TId getId()
    {
        return _id_;
    }

    public void setId(TId node)
    {
        if(_id_ != null)
        {
            _id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _id_ = node;
    }

    public LinkedList getGroupEqVal()
    {
        return _groupEqVal_;
    }

    public void setGroupEqVal(List list)
    {
        _groupEqVal_.clear();
        _groupEqVal_.addAll(list);
    }

    public LinkedList getGroupCommaIdEqVal()
    {
        return _groupCommaIdEqVal_;
    }

    public void setGroupCommaIdEqVal(List list)
    {
        _groupCommaIdEqVal_.clear();
        _groupCommaIdEqVal_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_id_)
            + toString(_groupEqVal_)
            + toString(_groupCommaIdEqVal_);
    }

    void removeChild(Node child)
    {
        if(_id_ == child)
        {
            _id_ = null;
            return;
        }

        if(_groupEqVal_.remove(child))
        {
            return;
        }

        if(_groupCommaIdEqVal_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        for(ListIterator i = _groupEqVal_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator i = _groupCommaIdEqVal_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

    }

    private class GroupEqVal_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PGroupEqVal node = (PGroupEqVal) o;

            if((node.parent() != null) &&
                (node.parent() != AArgument.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AArgument.this))
            {
                node.parent(AArgument.this);
            }

            return node;
        }
    }

    private class GroupCommaIdEqVal_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PGroupCommaIdEqVal node = (PGroupCommaIdEqVal) o;

            if((node.parent() != null) &&
                (node.parent() != AArgument.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AArgument.this))
            {
                node.parent(AArgument.this);
            }

            return node;
        }
    }
}