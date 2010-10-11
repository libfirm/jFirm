/*
 * Copyright (C) 1995-2008 University of Karlsruhe.  All right reserved.
 *
 * This file is part of libFirm.
 *
 * This file may be distributed and/or modified under the terms of the
 * GNU General Public License version 2 as published by the Free Software
 * Foundation and appearing in the file LICENSE.GPL included in the
 * packaging of this file.
 *
 * Licensees holding valid libFirm Professional Edition licenses may use
 * this file in accordance with the libFirm Commercial License.
 * Agreement provided with the Software.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 * WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE.
 */

/**
 * @file
 * @brief       Should be included in all public firm headers at the end
 * @author      Matthias Braun
 * @version     $Id: end.h 27564 2010-05-20 12:54:31Z matze $
 */
#ifndef FIRM_END_H
#define FIRM_END_H

#ifndef FIRM_BEGIN_H
#error "end.h included without begin.h?"
#endif

/* close extern "C" block from begin.h */
#ifdef __cplusplus
}
#endif

#endif
