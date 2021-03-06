/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.music.datatype.api;

/**
 * Enum with the {@link #getDiatonicSteps() diatonic} {@link Interval}s.
 *
 * @author hohwille
 */
public enum DiatonicInterval implements Interval {

  /** The "empty" interval. Also called <em>primum</em>. */
  UNISON(0),

  /** <em>secundum</em>. */
  SECOND(1),

  /** <em>tertium</em>. */
  THIRD(2),

  /** <em>quartum</em>. */
  FOURTH(3),

  /** <em>quintum</em>. */
  FIFTH(4),

  /** <em>sextum</em>. */
  SIXTH(5),

  /** <em>septum</em>. */
  SEVENTH(6),

  /** Eight or <em>octave</em>. */
  OCTAVE(7),

  /** <em>nonum</em>. */
  NINTH(8),

  /** <em>decum</em>. */
  TENTH(9),

  /** <em>decum</em>. */
  ELEVENTH(10),

  /** <em>decum</em> or <em>tritave</em>. */
  TWELFTH(11),

  /** <em>decum</em>. */
  THIRTEENTH(11);

  private final int diatonicSteps;

  /**
   * The constructor.
   *
   * @param diatonicSteps - see {@link #getDiatonicSteps()}.
   */
  private DiatonicInterval(int diatonicSteps) {

    this.diatonicSteps = diatonicSteps;
  }

  @Override
  public Integer getChromaticSteps(TonalSystem system) {

    if (this == UNISON) {
      return Integer.valueOf(0);
    } else if (this == OCTAVE) {
      return Integer.valueOf(12);
    }
    return null;
  }

  @Override
  public Integer getDiatonicSteps(TonalSystem system) {

    return Integer.valueOf(this.diatonicSteps);
  }

  /**
   * @see #getDiatonicSteps(TonalSystem)
   *
   * @return the number of diatonic steps defined by this interval.
   */
  public int getDiatonicSteps() {

    return this.diatonicSteps;
  }

}
