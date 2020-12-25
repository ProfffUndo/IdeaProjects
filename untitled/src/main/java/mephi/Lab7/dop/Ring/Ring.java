package mephi.Lab7.dop.Ring;

import java.util.*;

public interface Ring<T> extends Collection<T> {
      T previous();
      T next();
      T current();
      void goNext();
      void goPrev();

}
