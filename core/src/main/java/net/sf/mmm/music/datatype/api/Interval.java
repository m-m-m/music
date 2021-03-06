/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.music.datatype.api;

/**
 * Interface for an {@link Interval} that defines the distance from one {@link TonePitch} to another.
 *
 * @author hohwille
 */
public interface Interval {

  /**
   * Returns the number of chromatic semitone steps from the initial {@link TonePitch}.<br/>
   * <b>ATTENTION:</b><br/>
   * This means the result is {@code 0}-based, so e.g. for {@link ChromaticInterval#PERFECT_FOURTH} it will return
   * {@code 5}.
   *
   * @param system the underlying {@link TonalSystem}.
   * @return the number of semitone steps relative to the initial {@link TonePitch} (tonika) or {@code null} if
   *         undefined (e.g. for {@link Solmization} if {@link TonalSystem} is {@code null} or in case of a
   *         {@link DiatonicInterval}). The modulo of eight (%12) of the result is the {@link java.util.List#get(int)
   *         index} of the {@link TonePitch} from the {@link MusicalKey#getChromaticScale() chromatic scale} of the
   *         {@link MusicalKey} with the initial {@link TonePitch} as {@link MusicalKey#getTonika() tonika}).
   */
  Integer getChromaticSteps(TonalSystem system);

  /**
   * Returns the number of diatonic steps from the initial {@link TonePitch}.<br/>
   * <b>ATTENTION:</b><br/>
   * This means the result is {@code 0}-based, so e.g. for {@link DiatonicInterval#THIRD} it will return {@code 2} (NOT
   * {@code 3}) and for {@link DiatonicInterval#OCTAVE} it will return {@code 7} (NOT {@code 8}).
   *
   * @param system the underlying {@link TonalSystem}.
   * @return the number of diatonic steps relative to the initial {@link TonePitch} (tonika) or {@code null} if
   *         undefined (e.g. for {@link Solmization} if {@link TonalSystem} is {@code null}). The modulo of eight (%8)
   *         of the result is the {@link java.util.List#get(int) index} of the {@link TonePitch} from the
   *         {@link MusicalKey#getDiatonicScale() diatonic scale} of the {@link MusicalKey} with the initial
   *         {@link TonePitch} as {@link MusicalKey#getTonika() tonika}).
   */
  Integer getDiatonicSteps(TonalSystem system);

}
