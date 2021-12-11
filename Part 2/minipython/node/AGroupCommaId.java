/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AGroupCommaId extends PGroupCommaId
{
    private TId _id_;
    private final LinkedList _groupAsId_ = new TypedLinkedList(new GroupAsId_Cast());

    public AGroupCommaId()
    {
    }

    public AGroupCommaId(
        TId _id_,
        List _groupAsId_)
    {
        setId(_id_);

        {
            this._groupAsId_.clear();
            this._groupAsId_.addAll(_groupAsId_);
        }

    }
    public Object clone()
    {
        return new AGroupCommaId(
            (TId) cloneNode(_id_),
            cloneList(_groupAsId_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGroupCommaId(this);
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

    public LinkedList getGroupAsId()
    {
        return _groupAsId_;
    }

    public void setGroupAsId(List list)
    {
        _groupAsId_.clear();
        _groupAsId_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_id_)
            + toString(_groupAsId_);
    }

    void removeChild(Node child)
    {
        if(_id_ == child)
        {
            _id_ = null;
            return;
        }

        if(_groupAsId_.remove(child))
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

        for(ListIterator i = _groupAsId_.listIterator(); i.hasNext();)
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

    private class GroupAsId_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PGroupAsId node = (PGroupAsId) o;

            if((node.parent() != null) &&
                (node.parent() != AGroupCommaId.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AGroupCommaId.this))
            {
                node.parent(AGroupCommaId.this);
            }

            return node;
        }
    }
}