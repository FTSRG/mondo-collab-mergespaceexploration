/**
 */
package WTSpecID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>wtc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WTSpecID.wtc#getSysId <em>Sys Id</em>}</li>
 *   <li>{@link WTSpecID.wtc#getDescription <em>Description</em>}</li>
 *   <li>{@link WTSpecID.wtc#getCycle <em>Cycle</em>}</li>
 *   <li>{@link WTSpecID.wtc#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see WTSpecID.WTSpecIDPackage#getwtc()
 * @model abstract="true"
 * @generated
 */
public interface wtc extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sys Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sys Id</em>' attribute.
	 * @see #setSysId(String)
	 * @see WTSpecID.WTSpecIDPackage#getwtc_SysId()
	 * @model
	 * @generated
	 */
	String getSysId();

	/**
	 * Sets the value of the '{@link WTSpecID.wtc#getSysId <em>Sys Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys Id</em>' attribute.
	 * @see #getSysId()
	 * @generated
	 */
	void setSysId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see WTSpecID.WTSpecIDPackage#getwtc_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link WTSpecID.wtc#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycle</em>' attribute.
	 * @see #setCycle(short)
	 * @see WTSpecID.WTSpecIDPackage#getwtc_Cycle()
	 * @model
	 * @generated
	 */
	short getCycle();

	/**
	 * Sets the value of the '{@link WTSpecID.wtc#getCycle <em>Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycle</em>' attribute.
	 * @see #getCycle()
	 * @generated
	 */
	void setCycle(short value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(short)
	 * @see WTSpecID.WTSpecIDPackage#getwtc_Priority()
	 * @model
	 * @generated
	 */
	short getPriority();

	/**
	 * Sets the value of the '{@link WTSpecID.wtc#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(short value);

} // wtc