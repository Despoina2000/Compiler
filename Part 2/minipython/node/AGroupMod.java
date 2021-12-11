/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AGroupMod extends PGroupMod
{
    private PModule _module_;
    private final LinkedList _groupAsId_ = new TypedLinkedList(new GroupAsId_Cast());

    public AGroupMod()
    {
    }

    public AGroupMod(
        PModule _module_,
        List _groupAsId_)
    {
        setModule(_module_);

        {
            this._groupAsId_.clear();
            this._groupAsId_.addAll(_groupAsId_);
        }

    }
    public Object clone()
    {
        return new AGroupMod(
            (PModule) cloneNode(_module_),
            cloneList(_groupAsId_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGroupMod(this);
    }

    public PModule getModule()
    {
        return _module_;
    }

    public void setModule(PModule node)
    {
        if(_module_ != null)
        {
            _module_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _module_ = node;
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
            + toString(_module_)
            + toString(_groupAsId_);
    }

    void removeChild(Node child)
    {
        if(_module_ == child)
        {
            _module_ = null;
            return;
        }

        if(_groupAsId_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_module_ == oldChild)
        {
            setModule((PModule) newChild);
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
                (node.parent() != AGroupMod.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AGroupMod.this))
            {
                node.parent(AGroupMod.this);
            }

            return node;
        }
    }
}