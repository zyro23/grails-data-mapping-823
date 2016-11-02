package sample

import org.hibernate.envers.RevisionEntity
import org.hibernate.envers.RevisionNumber
import org.hibernate.envers.RevisionTimestamp

@RevisionEntity
class Revision {

	@RevisionNumber
	Long id

	@RevisionTimestamp
	Date date

}