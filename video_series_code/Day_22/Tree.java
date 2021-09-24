package video_series_code.Day_22;

public interface Tree <D extends Comparable<D>> {
    public boolean isEmpty();
    public int cardinality();
    public boolean member(D elt);
    public NonEmptyBST<D> add(D elt);



}
