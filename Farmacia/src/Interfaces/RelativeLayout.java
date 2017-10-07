/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Point;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 *
 * @author glupi
 */
public class RelativeLayout implements LayoutManager {
    /** requested absolute width of canvas */
  protected int reqWid;

  /** requested absolute height of canvas */
  protected int reqHgt;

  /** actual size width when laid out */
  protected int curWid;

  /** actual size height when laid out */
  protected int curHgt;

  /** to track Components added by named add form. */
  protected Vector curComps = new Vector();

  /**
   * Constructs an RelativeLayout, given original hard-coded size of panel.
   */
  public RelativeLayout(int wid, int ht) {
    this.reqWid = wid;
    this.reqHgt = ht;
  }
    @Override
    public void addLayoutComponent(String name, Component comp) {
        int x, y;
        StringTokenizer st = new StringTokenizer(name, ",");
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        // System.out.println("Adding: Name " + name +"; obj " + c
        //   + "; x " + x + "; y " + y);
        Tracker t = new Tracker(x, y, comp);
        curComps.addElement(t);
    }

    @Override
    public void removeLayoutComponent(Component comp) {
        curComps.removeElement(comp);
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        int prefw = 0, prefh = 0;
        for (int i = 0; i < curComps.size(); i++) {
          Tracker t = (Tracker) curComps.elementAt(i);
          Component tc = t.getComponent();
          Dimension d = tc.getMinimumSize();
          Point rl = t.getRequestedLoc();
          prefw = Math.max(prefw, rl.x + d.width);
          prefh = Math.max(prefh, rl.y + d.height);
          // System.out.println("prefLay, prefw = " +
          // prefw + "; prefh = " + prefh);
        }
        return new Dimension(prefw, prefh);
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        int minw = 0, minh = 0;
        for (int i = 0; i < curComps.size(); i++) {
          Tracker t = (Tracker) curComps.elementAt(i);
          Component tc = t.getComponent();
          Dimension d = tc.getMinimumSize();
          Point rl = t.getRequestedLoc();
          minw = Math.max(minw, rl.x + d.width);
          minh = Math.max(minh, rl.y + d.height);
          // System.out.println("minLay, minw = " + minw
          // + "; minh = " + minh);
        }
        return new Dimension(minw, minw);
    }

    @Override
    public void layoutContainer(Container parent) {
        Dimension targSize = parent.getSize();
    Insets ins = parent.getInsets();
    // System.out.println("layoutContainer: size " + targSize);
    curWid = targSize.width;
    curHgt = targSize.height;
    float widRatio = (float) curWid / (float) reqWid;
    float hgtRatio = (float) curHgt / (float) reqHgt;
    for (int i = 0; i < curComps.size(); i++) {
      int px, py, pw, ph;
      Tracker t = (Tracker) curComps.elementAt(i);
      Component tc = t.getComponent();
      Dimension d = tc.getPreferredSize();
      px = ins.right + (int) (t.getRequestedLoc().x * widRatio);
      py = ins.top + (int) (t.getRequestedLoc().y * hgtRatio);
      pw = d.width;
      ph = d.height;
      // System.out.println("layoutContainer["+i+"]: move " +
      // tc + " to " + px + ", " + py);
      tc.setBounds(px, py, pw, ph);
    }
}
    public class Tracker {
    int absx, absy;

    Component theComp;

    /** Construct a tracker item given its location and Component. */
    Tracker(int x, int y, Component c) {
      this.absx = x;
      this.absy = y;
      this.theComp = c;
    }

    /** Extract the location as a Point. */
    public Point getRequestedLoc() {
      return new Point(absx, absy);
    }

    /** Extract the Component from this Tracker. */
    public Component getComponent() {
      return theComp;
    }
  }
}
