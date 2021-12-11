/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AForStatement extends PStatement
{
    private final LinkedList _tab_ = new TypedLinkedList(new Tab_Cast());
    private TFor _for_;
    private TId _id1_;
    private TIn _in_;
    private TId _id2_;
    private TSemi _semi_;
    private PStatement _statement_;

    public AForStatement()
    {
    }

    public AForStatement(
        List _tab_,
        TFor _for_,
        TId _id1_,
        TIn _in_,
        TId _id2_,
        TSemi _semi_,
        PStatement _statement_)
    {
        {
            this._tab_.clear();
            this._tab_.addAll(_tab_);
        }

        setFor(_for_);

        setId1(_id1_);

        setIn(_in_);

        setId2(_id2_);

        setSemi(_semi_);

        setStatement(_statement_);

    }
    public Object clone()
    {
        return new AForStatement(
            cloneList(_tab_),
            (TFor) cloneNode(_for_),
            (TId) cloneNode(_id1_),
            (TIn) cloneNode(_in_),
            (TId) cloneNode(_id2_),
            (TSemi) cloneNode(_semi_),
            (PStatement) cloneNode(_statement_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAForStatement(this);
    }

    public LinkedList getTab()
    {
        return _tab_;
    }

    public void setTab(List list)
    {
        _tab_.clear();
        _tab_.addAll(list);
    }

    public TFor getFor()
    {
        return _for_;
    }

    public void setFor(TFor node)
    {
        if(_for_ != null)
        {
            _for_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _for_ = node;
    }

    public TId getId1()
    {
        return _id1_;
    }

    public void setId1(TId node)
    {
        if(_id1_ != null)
        {
            _id1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _id1_ = node;
    }

    public TIn getIn()
    {
        return _in_;
    }

    public void setIn(TIn node)
    {
        if(_in_ != null)
        {
            _in_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _in_ = node;
    }

    public TId getId2()
    {
        return _id2_;
    }

    public void setId2(TId node)
    {
        if(_id2_ != null)
        {
            _id2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _id2_ = node;
    }

    public TSemi getSemi()
    {
        return _semi_;
    }

    public void setSemi(TSemi node)
    {
        if(_semi_ != null)
        {
            _semi_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _semi_ = node;
    }

    public PStatement getStatement()
    {
        return _statement_;
    }

    public void setStatement(PStatement node)
    {
        if(_statement_ != null)
        {
            _statement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _statement_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_tab_)
            + toString(_for_)
            + toString(_id1_)
            + toString(_in_)
            + toString(_id2_)
            + toString(_semi_)
            + toString(_statement_);
    }

    void removeChild(Node child)
    {
        if(_tab_.remove(child))
        {
            return;
        }

        if(_for_ == child)
        {
            _for_ = null;
            return;
        }

        if(_id1_ == child)
        {
            _id1_ = null;
            return;
        }

        if(_in_ == child)
        {
            _in_ = null;
            return;
        }

        if(_id2_ == child)
        {
            _id2_ = null;
            return;
        }

        if(_semi_ == child)
        {
            _semi_ = null;
            return;
        }

        if(_statement_ == child)
        {
            _statement_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        for(ListIterator i = _tab_.listIterator(); i.hasNext();)
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

        if(_for_ == oldChild)
        {
            setFor((TFor) newChild);
            return;
        }

        if(_id1_ == oldChild)
        {
            setId1((TId) newChild);
            return;
        }

        if(_in_ == oldChild)
        {
            setIn((TIn) newChild);
            return;
        }

        if(_id2_ == oldChild)
        {
            setId2((TId) newChild);
            return;
        }

        if(_semi_ == oldChild)
        {
            setSemi((TSemi) newChild);
            return;
        }

        if(_statement_ == oldChild)
        {
            setStatement((PStatement) newChild);
            return;
        }

    }

    private class Tab_Cast implements Cast
    {
        public Object cast(Object o)
        {
            TTab node = (TTab) o;

            if((node.parent() != null) &&
                (node.parent() != AForStatement.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AForStatement.this))
            {
                node.parent(AForStatement.this);
            }

            return node;
        }
    }
}