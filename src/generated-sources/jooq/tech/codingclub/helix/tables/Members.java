/**
 * This class is generated by jOOQ
 */
package tech.codingclub.helix.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Members extends org.jooq.impl.TableImpl<tech.codingclub.helix.tables.records.MembersRecord> {

	private static final long serialVersionUID = -786251722;

	/**
	 * The singleton instance of <code>public.members</code>
	 */
	public static final tech.codingclub.helix.tables.Members MEMBERS = new tech.codingclub.helix.tables.Members();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<tech.codingclub.helix.tables.records.MembersRecord> getRecordType() {
		return tech.codingclub.helix.tables.records.MembersRecord.class;
	}

	/**
	 * The column <code>public.members.name</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.MembersRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>public.members.email</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.MembersRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>public.members.role</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.MembersRecord, java.lang.String> ROLE = createField("role", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>public.members.password</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.MembersRecord, java.lang.String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>public.members.image</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.MembersRecord, java.lang.String> IMAGE = createField("image", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>public.members.token</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.MembersRecord, java.lang.String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

	/**
	 * The column <code>public.members.is_verified</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.MembersRecord, java.lang.Boolean> IS_VERIFIED = createField("is_verified", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>public.members.id</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.MembersRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>public.members</code> table reference
	 */
	public Members() {
		this("members", null);
	}

	/**
	 * Create an aliased <code>public.members</code> table reference
	 */
	public Members(java.lang.String alias) {
		this(alias, tech.codingclub.helix.tables.Members.MEMBERS);
	}

	private Members(java.lang.String alias, org.jooq.Table<tech.codingclub.helix.tables.records.MembersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Members(java.lang.String alias, org.jooq.Table<tech.codingclub.helix.tables.records.MembersRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, tech.codingclub.helix.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<tech.codingclub.helix.tables.records.MembersRecord, java.lang.Long> getIdentity() {
		return tech.codingclub.helix.Keys.IDENTITY_MEMBERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<tech.codingclub.helix.tables.records.MembersRecord> getPrimaryKey() {
		return tech.codingclub.helix.Keys.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<tech.codingclub.helix.tables.records.MembersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<tech.codingclub.helix.tables.records.MembersRecord>>asList(tech.codingclub.helix.Keys.EMAIL, tech.codingclub.helix.Keys.ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public tech.codingclub.helix.tables.Members as(java.lang.String alias) {
		return new tech.codingclub.helix.tables.Members(alias, this);
	}

	/**
	 * Rename this table
	 */
	public tech.codingclub.helix.tables.Members rename(java.lang.String name) {
		return new tech.codingclub.helix.tables.Members(name, null);
	}
}