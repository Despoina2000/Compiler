/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AFromImportImportType extends PImportType
{
    private TId _id_;
    private final LinkedList _groupAsId_ = new TypedLinkedList(new GroupAsId_Cast());
    private final LinkedList _groupCommaId_ = new TypedLinkedList(new GroupCommaId_Cast());

    public AFromImportImportType()
    {
    }

    public AFromImportImportType(
        TId _id_,
        List _groupAsId_,
        List _groupCommaId_)
    {
        setId(_id_);

        {
            this._groupAsId_.clear();
            this._groupAsId_.addAll(_groupAsId_);
        }

        {
            this._groupCommaId_.clear();
            this._groupCommaId_.addAll(_groupCommaId_);
        }

    }
    public Object clone()
    {
        return new AFromImportImportType(
            (TId) cloneNode(_id_),
            cloneList(_groupAsId_),
            cloneList(_groupCommaId_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFromImportImportType(this);
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

    public LinkedList getGroupCommaId()
    {
        return _groupCommaId_;
    }

    public void setGroupCommaId(List list)
    {
        _groupCommaId_.clear();
        _groupCommaId_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_id_)
            + toString(_groupAsId_)
            + toString(_groupCommaId_);
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

        if(_groupCommaId_.remove(child))
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

        for(ListIterator i = _groupCommaId_.listIterator(); i.hasNext();)
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
                (node.parent() != AFromImportImportType.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AFromImportImportType.this))
            {
                node.parent(AFromImportImportType.this);
            }

            return node;
        }
    }

    private class GroupCommaId_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PGroupCommaId node = (PGroupCommaId) o;

            if((node.parent() != null) &&
                (node.parent() != AFromImportImportType.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AFromImportImportType.this))
            {
                node.parent(AFromImportImportType.this);
            }

            return node;
        }
    }
}