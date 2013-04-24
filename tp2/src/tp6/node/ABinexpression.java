/* This file was generated by SableCC (http://www.sablecc.org/). */

package tp6.node;

import tp6.analysis.*;

@SuppressWarnings("nls")
public final class ABinexpression extends PBinexpression
{
    private PUniexpression _lExp_;
    private POperator _operator_;
    private PExpression _rExp_;

    public ABinexpression()
    {
        // Constructor
    }

    public ABinexpression(
        @SuppressWarnings("hiding") PUniexpression _lExp_,
        @SuppressWarnings("hiding") POperator _operator_,
        @SuppressWarnings("hiding") PExpression _rExp_)
    {
        // Constructor
        setLExp(_lExp_);

        setOperator(_operator_);

        setRExp(_rExp_);

    }

    @Override
    public Object clone()
    {
        return new ABinexpression(
            cloneNode(this._lExp_),
            cloneNode(this._operator_),
            cloneNode(this._rExp_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABinexpression(this);
    }

    public PUniexpression getLExp()
    {
        return this._lExp_;
    }

    public void setLExp(PUniexpression node)
    {
        if(this._lExp_ != null)
        {
            this._lExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lExp_ = node;
    }

    public POperator getOperator()
    {
        return this._operator_;
    }

    public void setOperator(POperator node)
    {
        if(this._operator_ != null)
        {
            this._operator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._operator_ = node;
    }

    public PExpression getRExp()
    {
        return this._rExp_;
    }

    public void setRExp(PExpression node)
    {
        if(this._rExp_ != null)
        {
            this._rExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rExp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lExp_)
            + toString(this._operator_)
            + toString(this._rExp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lExp_ == child)
        {
            this._lExp_ = null;
            return;
        }

        if(this._operator_ == child)
        {
            this._operator_ = null;
            return;
        }

        if(this._rExp_ == child)
        {
            this._rExp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lExp_ == oldChild)
        {
            setLExp((PUniexpression) newChild);
            return;
        }

        if(this._operator_ == oldChild)
        {
            setOperator((POperator) newChild);
            return;
        }

        if(this._rExp_ == oldChild)
        {
            setRExp((PExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
