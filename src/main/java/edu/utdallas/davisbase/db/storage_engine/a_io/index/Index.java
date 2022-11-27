package edu.utdallas.davisbase.db.storage_engine.a_io.index;

import edu.utdallas.davisbase.db.frontend.domain.clause.D_Constant;
import edu.utdallas.davisbase.db.storage_engine.a_io.data.heap.RecordId;

/**
 * This interface contains methods to traverse an index.
 *
 * @author Edward Sciore
 */
public interface Index {

    // CRUD
    public void insert(D_Constant dataval, RecordId datarid);

    public void delete(D_Constant dataval, RecordId datarid);

    // Iterator
    public void seek(D_Constant searchkey);

    public boolean next();

    public void close();

    public RecordId getRecordId();
}
